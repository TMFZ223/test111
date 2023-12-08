import geb.Browser

Browser.drive {
    // Открытие страницы mosmetro.ru
    go "https://mosmetro.ru"

    // Получение всех параграфов на странице
    def paragraphs = $$("p")

    // Вывод текста с первого по пятьдесятый параграф
    for (int i = 0; i < 50; i++) {
        println paragraphsi.text()
    }
}