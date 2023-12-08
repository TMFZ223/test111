import geb.Browser

Browser.drive {
    // Открытие страницы mosmetro.ru
    go "https://mosmetro.ru"

    // Поиск и вывод названий параграфов
    (51..999).each { index ->
        def buttonName = $("button", index)
        if (buttonName) {
            println "Название кнопки ${index + 1}: ${PName.text()}"
        } else {
            println "Кнопка ${index + 1} не найдена"
        }
    }
}