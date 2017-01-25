package etl;

public class ControllerApp {
    public static void main(String[] args) {
        new EtlController(
            new FileCsvExtractor(),
            new Loader[] {new FileXmlLoader(), new FileXmlLoader()}
        ).doEtl();
    }
}
