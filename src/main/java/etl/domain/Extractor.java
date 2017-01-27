package etl.domain;

import etl.extractor.EtlFormatException;

public interface Extractor {
    User[] extract() throws EtlFormatException;
}
