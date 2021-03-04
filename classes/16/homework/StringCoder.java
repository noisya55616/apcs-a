public class StringCoder {
    private String masterString;

    public StringCoder(String master) {
        masterString = master;
    }

    public String decodeString(ArrayList<StringPart> parts) {
        String cleartext = "";

        for (int i = 0; i < parts.size(); i++) {
            StringPart part = parts.get(i);
            cleartext += masterString.subString(part.getStart(), part.getStart() + part.getLength());
        }

        return cleartext;
    }

    public ArrayList<StringPart> encodeString(String word) {
        ArrayList<StringPart> encoded = new ArrayList<StringPart>();

        for (int i = 0; i < word.length(); i++) {
            encoded.add(this.findPart(word.substring(i, i + 1)));
        }
    }
}
