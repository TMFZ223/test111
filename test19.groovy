import geb.Browser

Browser.drive {
    // Открытие страницы mosmetro.ru
    go "https://mosmetro.ru"

    // Получение текста из первого тега "p"
    def text = $("p", 28).text()

    // Вывод текста в консоль
    println(text)
}