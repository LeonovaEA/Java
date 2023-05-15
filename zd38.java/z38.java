public class ZD38 {
    public static void main(String[] args) {
        String text = "Хочу каникулы,а не вот это все";
        String[] sentences = text.split("\\.\\s*");

        for (int q = 0; q < sentences.length; q++) {
            String[] replace = sentences[q].split("\\s+");
            for (int j = 0; j < replace.length; j++) {
                String rest = words[j].substring(1);
                words[j] = rest + firstLetter + "ауч";
            }
            sentences[q] = String.join(" ", replace) + ".";
        }

        String result = String.join(" ", sentences);
        System.out.println(result);
    }

}

