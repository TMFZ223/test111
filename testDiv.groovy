import geb.Browser

Browser.drive {
    // Открытие страницы mosmetro.ru
    go "https://mosmetro.ru/metro-map"

    // Находим все элементы div с классом "fromto__select-list-item"
    def divElements = $("div.fromto__select-list-item")

    // Выводим текст на каждом элементе
    divElements.each { divElements ->
        println divElements.text()
    }
}