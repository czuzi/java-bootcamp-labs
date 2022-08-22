package stringmethod.filename;

public class FileName {

	public char findLastCharacter(String str) {
		str = str.strip();
		return str.charAt(str.length()-1);
	}

	public String findFileExtension(String str) {
		str = str.strip();
		return str.substring(str.lastIndexOf("."));
	}

	public boolean identifyFilesByExtension(String ext, String fileName) {
		ext = ext.strip();
		fileName = fileName.strip();
		return fileName.endsWith(ext);
	}

	public boolean compareFilesByName(String fileName, String actualFileName) {
		return fileName.strip().equalsIgnoreCase(actualFileName.strip());
	}

	public String changeExtensionToLowerCase(String fileName) {
		fileName = fileName.strip();
		int index = fileName.lastIndexOf(".");
		String namePart = fileName.substring(0, index);
		String ext = fileName.substring(index).toLowerCase();
		return namePart + ext;
	}

	public String replaceStringPart(String fileName, String present, String target) {
		return fileName.replace(present, target);
	}
}
