/*Создайте программу, которая читает текст и возвращает его версию после применения правил
Обратный ход: Если слово содержит хотя бы одну цифру, оставьте его без изменений.
Если в нем нет цифр, то изменить порядок букв в этом слове.*/
class ReverseWords {
    public static String processText(String text) {
        String[] words = text.split("\\s+");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (!word.matches(".*\\d.*")) {
                result.append(new StringBuilder(word).reverse()).append(" ");
            } else {
                result.append(word).append(" ");
            }
        }

        return result.toString().trim();
    }
}




