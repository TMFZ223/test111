import geb.Browser

Browser.drive {
    // Открытие страницы mosmetro.ru
    go "https://mosmetro.ru"

    // Поиск и вывод названий заголовков
    (5..999).each { index ->
        def heder = $("h1, h2, h3, h4, h5, h6, h7", index)
        if (heder) {
            println "Название заголовка ${index + 1}: ${heder.text()}"
        } else {
            println "Заголовок ${index + 1} не найден"
        }
    }
}