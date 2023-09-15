package productos.ejemplos;

import java.io.IOException;

public class LanzarProcesoExterno {
    public static void main(String[] args) throws IOException {
        String rutaWindows = "C:\\Program Files\\Mozilla Firefox\\firefox.exe";
        String rutaLinux = "/usr/lib/firefox/firefox.sh";

        ProcessBuilder constructorProcesos = new ProcessBuilder(rutaWindows);

        try{
            constructorProcesos.start();
        }catch (IOException e){
            throw  new RuntimeException(e);
        }
    }
}
