import geb.Browser

Browser.drive {
    go "https://mosmetro.ru"

    // Проверка названия у ссылки
    def firstLink = $("a")[0]

    if (firstLink.text()) {
        println "Ссылка имеет название"
    } else {
        println "Ссылка не имеет название"
    }
}