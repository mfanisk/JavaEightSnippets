import java.io.File;
import java.io.FileFilter;

public class FileFilterImpl implements FileFilter{

    @Override
    public boolean accept(File pathname) {
        return pathname.getName().endsWith(".java");
    }
}


class FileFileterImpls {

    FileFilter lambdaImpl = (File pathname) -> pathname.getName().endsWith(".java");


    FileFilter anonymousImpl = new FileFilter() {
        @Override
        public boolean accept(File pathname) {
            return pathname.getName().endsWith(".java");
        }
    };
};


