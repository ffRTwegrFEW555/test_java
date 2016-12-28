package rules.temporary_folder;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.File;
import java.io.IOException;

/**
 * Created by USER on 28.12.2016, 12:11.
 *
 * @author Vadim Gamaliev <a href="mailto:gamaliev-vadim@yandex.com">gamaliev-vadim@yandex.com</a>
 * @version 1.0
 */
public class HasTempFolder {
    @Rule
    public TemporaryFolder folder = new TemporaryFolder();

    /*
        @Rule
        public TemporaryFolder folder = TemporaryFolder.builder().assureDeletion().build();
    */

    @Test
    public void testUsingTempFolder() throws IOException {
        File createdFile = folder.newFile("myfile.txt");
        File createdFolder = folder.newFolder("subfolder");
        // ...
    }
}
