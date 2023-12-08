import geb.Browser

Browser.drive {
    // Открытие страницы mosmetro.ru
    go "https://mosmetro.ru/metro-map"

    // Поиск и вывод названий кнопок
    (0..999).each { index ->
        def hedersOutput = $("h", index)
        if (hedersOutput) {
            println "Название заголовка ${index + 1}: ${hedersOutput.text()}"
        } else {
            println "Заголовок ${index + 1} не найден"
        }
    }
}