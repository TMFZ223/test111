import geb.Browser

Browser.drive {
    // Открытие страницы mosmetro.ru
    go "https://mosmetro.ru/passengers/information/stations/247"

    // Поиск и вывод текстов текстовых блоков
    (0..3).each { index ->
        def textOutput = $("div", index)
        if (textOutput) {
            println "Текст в теге  ${index + 1}: ${textOutput.text()}"
        } else {
            println " ${index + 1} не найдено"
        }
    }
}