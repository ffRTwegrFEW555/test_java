package _number._integer;

import javax.xml.bind.DatatypeConverter;
import java.io.UnsupportedEncodingException;

/**
 * Created by USER on 26.01.2017, 15:01.
 *
 * @author Vadim Gamaliev <a href="mailto:gamaliev-vadim@yandex.com">gamaliev-vadim@yandex.com</a>
 * @version 1.0
 */
public class HexSolution {
    public static void main(String[] args) throws UnsupportedEncodingException {

        String hex = "6D37D669765773F41A3925DB5DFFE04DF4534D05E60000000000004137E75DC5DC3BF84E869B9C3BF41766175F75070E0000";
        String[] decoding = {" ", ",", "_", "'", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "А",
                "Б", "В", "Г", "Д", "Е", "Ё", "Ж", "З", "И", "Й", "К", "Л", "М", "Н", "О", "П", "Р", "С", "Т",
                "У", "Ф", "Х", "Ц", "Ч", "Ш", "Щ", "Ь", "Ъ", "Ы", "Э", "Ю" ,"Я",
                "","","","","","","","","","",
                "","","","","","","|"
        };
        StringBuilder binaryString = new StringBuilder();
        StringBuilder result = new StringBuilder().append("Result:\n");

        byte[] bit8 = DatatypeConverter.parseHexBinary(hex);
        for (byte b : bit8) {
            binaryString.append(String.format("%8s", Integer.toBinaryString(b & 0xFF)).replaceAll(" ", "0"));
        }
        for (int i = 0; i + 6 < binaryString.length(); i += 6) {
            int unsignedInt = Integer.parseUnsignedInt(binaryString.substring(i, i + 6), 2);
            result.append(decoding[unsignedInt]);
        }

        System.out.println(result.toString());
    }
}
