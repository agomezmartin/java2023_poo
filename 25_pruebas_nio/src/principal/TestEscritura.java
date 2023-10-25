package principal;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class TestEscritura {

	public static void main(String[] args) throws IOException {
		String dir="c:\\temp\\productos.txt";
		List<String> lst=List.of("pan","agua","filete","pizza","fanta");
		//guarda productos en fichero
		Path path=Path.of(dir);
		Files.write(path, lst);
		//guarda un nuevo producto
		Files.writeString(path, "cerveza",StandardOpenOption.APPEND);

	}

}
