package principal;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TestLectura {

	public static void main(String[] args) throws IOException {
		String dir="c:\\temp\\productos.txt";
		Path path=Path.of(dir);
		Files.lines(path)  //Stream<String>
		.forEach(System.out::println);

	}

}
