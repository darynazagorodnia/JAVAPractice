package exceptions;

import java.io.Closeable;
import java.io.FileNotFoundException;

public interface SelfClosable extends AutoCloseable {
    @Override
    void close() throws Exception;
}

