import geb.Browser

Browser.drive {
    go "https://mosmetro.ru/metro-map"
    // Получение всех графических элементов на странице
    def graphicsElement = $("text")

    // Печать количества графических элементов
    println "Текст графических элементов: ${graphicsElement.text()}"
}