import geb.Browser

Browser.drive {
    go "https://mosmetro.ru/metro-map"

    def DivElementsCount = $("div", class: "fromto__select-list-item").size()

    println "Количество Текстовых блоков для двух областей на странице: $DivElementsCount"
}