package etl;


public class EtlController {
    private Extractor extractor;
    private Loader[] loaders;

    public EtlController(Extractor extractor, Loader[] loaders) {
        this.extractor = extractor;
        this.loaders = loaders;
    }

    public void doEtl() {
        EtlException etlException = null;
        try {
            //....
            final User[] extractedUsers = extractor.extract();
            for (Loader loader : loaders) {
                loader.load(extractedUsers);
            }
            //.....
        } catch (RuntimeException e) {
            etlException = new EtlException("Etl problem, don't panic!!!", e);
            throw etlException;
        } catch (Exception e) {

        } finally {
            final RuntimeException runtimeException = new RuntimeException("3");
            if (etlException != null) runtimeException.addSuppressed(etlException);
            throw runtimeException;
        }
    }
}
