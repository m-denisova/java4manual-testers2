package etl;

public interface Extractor {
    User[] extract() throws EtlFormatException;
}
