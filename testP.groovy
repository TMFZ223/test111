import geb.Browser

Browser.drive {
    go "https://mosmetro.ru/metro-map"
    waitFor { title == "Схема московского метро" }
    // Найти SVG элементы
    def svgElements = $("svg").find("text")
    // Вывести текст на элементах
    svgElements.each { element ->
        println element.text()
    }
}