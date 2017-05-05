package _sql.builder;

import java.util.Arrays;

/**
 * @author Vadim Gamaliev
 *         <a href="mailto:gamaliev-vadim@yandex.com">(e-mail: gamaliev-vadim@yandex.com)</a>
 */

public final class DatabaseQueryBuilder {

    /* Logger */
    private static final String TAG = DatabaseQueryBuilder.class.getSimpleName();

    /* SQL */
    private static final String OPERATOR_OR             = " OR ";
    private static final String OPERATOR_AND            = " AND ";
    private static final String OPERATOR_EQUALS         = " = ";
    private static final String OPERATOR_BETWEEN        = " BETWEEN ";
    private static final String OPERATOR_LIKE           = " LIKE ";
    private static final String OPERATOR_MASK           = " ? ";

    private static final String SYMBOL_PERCENT          = "%";
    private static final String SYMBOL_SINGLE_QUOTE     = "'";

    private String[] selection;
    private String[] selectionArgs;

    private String order   = "id";
    private String ascDesc = " ASC";


    /*
    Cursor query (String table,
                String[] columns,
                String selection,
                String[] selectionArgs,
                String groupBy,
                String having,
                String orderBy)
     */



    /*
        Init
     */

    public DatabaseQueryBuilder() {
    }


    /*
        Methods
     */

    
    public DatabaseQueryBuilder addOr(
            final String column,
            final String operator,
            final String[] values) {

        return add(
                selection == null ? null : OPERATOR_OR,
                column,
                operator,
                values);
    }

    
    public DatabaseQueryBuilder addAnd(
            final String column,
            final String operator,
            final String[] values) {

        return add(
                selection == null ? null : OPERATOR_AND,
                column,
                operator,
                values);
    }

    
    public DatabaseQueryBuilder addOrInner(final DatabaseQueryBuilder dqb) {
        addInner(dqb, OPERATOR_OR);
        return this;
    }

    
    public DatabaseQueryBuilder addAndInner(final DatabaseQueryBuilder dqb) {
        addInner(dqb, OPERATOR_AND);
        return this;
    }

    private void addInner(
            final DatabaseQueryBuilder dqb,
            final String operator) {

        // Create inner clause.
        StringBuilder sb = new StringBuilder();

        if(selection != null) {
            sb.append(operator);
        }

        sb      .append(" (")
                .append(dqb.getSelectionResult())
                .append(") ");

        // Add new selection clause to old.
        updateSelectionClauses(
                sb.toString(),
                dqb.getSelectionArgs());
    }

    
    private DatabaseQueryBuilder add(
            final String operatorPrimary,
            final String column,
            final String operatorSecondary,
            final String[] values) {

        if (!(OPERATOR_BETWEEN.equals(operatorSecondary)
                || OPERATOR_LIKE.equals(operatorSecondary)
                || OPERATOR_EQUALS.equals(operatorSecondary))) {
            throw new UnsupportedOperationException(
                    "Supported only 'BETWEEN', 'LIKE' and '=' operators");
        }

        /*
            Example: "OR (title LIKE '?') "
            Example: "OR (color = ?) "
            Example: "OR (created BETWEEN '?' AND '?') "

            Example: "OR (title LIKE '%Droid%') "
            Example: "OR (color = 12345) "
            Example: "OR (created BETWEEN '2017-04-25T21:25:35+05:00' AND '2017-04-25T21:25:35+05:00') "
        */

        // Example: 'OR (title' or '(title'
        StringBuilder sb = new StringBuilder();

        if (operatorPrimary != null) {
            sb.append(operatorPrimary);
        }

        sb      .append("(")
                .append(column);

        switch (operatorSecondary) {

            // Example: " LIKE '?'"
            // Example: " LIKE '%Droid%'"
            case OPERATOR_LIKE:
                if (values.length != 1) {
                    throw new IllegalArgumentException(
                            "Operator 'LIKE' must operate with 1 operand.");
                } else {
                    sb      .append(OPERATOR_LIKE)
                            .append(OPERATOR_MASK);
                }
                values[0] = SYMBOL_SINGLE_QUOTE
                        + SYMBOL_PERCENT
                        + values[0]
                        + SYMBOL_PERCENT
                        + SYMBOL_SINGLE_QUOTE;
                break;

            // Example: " = ?"
            // Example: " = 12345"
            case OPERATOR_EQUALS:
                if (values.length != 1) {
                    throw new IllegalArgumentException(
                            "Operator '=' must operate with 1 operand.");
                } else {
                    sb      .append(OPERATOR_EQUALS)
                            .append(OPERATOR_MASK);
                }
                break;

            // Example: " BETWEEN '?' AND '?'"
            // Example: " BETWEEN '2017-04-25T21:25:35+05:00' AND '2017-04-25T21:25:35+05:00'"
            case OPERATOR_BETWEEN:
                if (values.length != 2) {
                    throw new IllegalArgumentException(
                            "Operator 'BETWEEN' must operate with two operands.");
                } else {
                    sb      .append(OPERATOR_BETWEEN)
                            .append(OPERATOR_MASK)
                            .append(OPERATOR_AND)
                            .append(OPERATOR_MASK);

                    values[0] = SYMBOL_SINGLE_QUOTE
                            + values[0]
                            + SYMBOL_SINGLE_QUOTE;

                    values[1] = SYMBOL_SINGLE_QUOTE
                            + values[1]
                            + SYMBOL_SINGLE_QUOTE;
                }
                break;

            //
            default:
                break;
        }

        // Example: ') '
        sb.append(") ");

        // Add new selection clause to old.
        updateSelectionClauses(sb.toString(), values);

        return this;
    }

    private void updateSelectionClauses(
            final String newSelectionString,
            final String[] newValues) {

        String[] newSelection       = new String[] {newSelectionString};
        String[] newSelectionArgs   = newValues;

        if (selection != null && selectionArgs != null) {

            // Create new selection, and selectionArgs clauses.
            newSelection        = new String[selection.length       + 1];
            newSelectionArgs    = new String[selectionArgs.length   + newValues.length];

            // Copy old array to new array.
            System.arraycopy(selection,     0, newSelection,        0, selection.length);
            System.arraycopy(selectionArgs, 0, newSelectionArgs,    0, selectionArgs.length);

            // Add new data to new array.
            newSelection[newSelection.length - 1] = newSelectionString;
            System.arraycopy(
                    newValues,
                    0,
                    newSelectionArgs,
                    newSelectionArgs.length - newValues.length,
                    newValues.length);
        }

        // Replacing old clauses with new.
        selection = newSelection;
        selectionArgs = newSelectionArgs;
    }


    /*
        Setters
     */

    public void setOrder(String order) {
        this.order = order;
    }

    public void setAscDesc(String ascDesc) {
        this.ascDesc = ascDesc;
    }


    /*
        Getters
     */

    
    public String getSelectionResult() {

        // Convert clauses array to one string clauses.
        StringBuilder sb = new StringBuilder();
        for (String cause : selection) {
            sb      .append(cause)
                    .append(" ");
        }
        return sb.toString();
    }

    
    public String[] getSelectionArgs() {
        return selectionArgs;
    }

    
    public String getOrder() {
        return order + ascDesc;
    }


    /*
        Test
     */
    public static void main(String[] args) {
        DatabaseQueryBuilder dqbInner = new DatabaseQueryBuilder();
        dqbInner.addOr("title",         OPERATOR_LIKE, new String[] {"hello"})
                .addOr("description",   OPERATOR_LIKE, new String[] {"hello"});

        DatabaseQueryBuilder dqb = new DatabaseQueryBuilder();
        dqb     .addAnd("color",     OPERATOR_EQUALS, new String[] {"12345"})
                .addAnd("created",   OPERATOR_BETWEEN,
                        new String[] {"2017-04-25T21:25:35+05:00", "2016-04-25T21:25:35+05:00"})

                .addAnd("modified",  OPERATOR_BETWEEN,
                        new String[] {"2015-04-25T21:25:35+05:00", "2014-04-25T21:25:35+05:00"})

                .addAndInner(dqbInner);

        System.out.println();
        System.out.println(dqb.getSelectionResult());
        System.out.println();
        System.out.println(Arrays.toString(dqb.getSelectionArgs()));
    }
}
