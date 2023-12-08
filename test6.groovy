import geb.Browser

Browser.drive {
    go "https://mosmetro.ru/passengers/information/stations/"

    def buttons = $("button").size()

    println "Количество кнопок на странице: $edits"
}