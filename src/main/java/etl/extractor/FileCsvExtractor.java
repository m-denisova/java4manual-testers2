package etl.extractor;

import etl.domain.Extractor;
import etl.domain.User;

public class FileCsvExtractor implements Extractor {
    @Override
    public User[] extract() throws EtlFormatException {
        //....
        if (true) throw new EtlFormatException("Illegal Format");
        return null;
        //.....
    }
}
