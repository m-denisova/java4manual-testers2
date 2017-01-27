package etl.domain;


public class EtlController {
    private Extractor extractor;
    private Loader[] loaders;

    public EtlController(Extractor extractor, Loader[] loaders) {
        this.extractor = extractor;
        this.loaders = loaders;
    }

    public void doEtl() throws EtlException {
        try {
            //....
            final User[] extractedUsers = extractor.extract();
            for (Loader loader : loaders) {
                loader.load(extractedUsers);
            }
            //.....
        } catch (RuntimeException e) {
            throw new EtlException("Etl problem, don't panic!!!", e, 5);
        } catch (Exception e) {

        } finally {

        }
    }
}
