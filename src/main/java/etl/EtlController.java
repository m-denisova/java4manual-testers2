package etl;


public class EtlController {
    private Extractor extractor;
    private Loader[] loaders;

    public EtlController(Extractor extractor, Loader[] loaders) {
        this.extractor = extractor;
        this.loaders = loaders;
    }

    public void doEtl() {
        final User[] extractedUsers = extractor.extract();
        for (Loader loader : loaders) {
            loader.load(extractedUsers);
        }
    }
}
