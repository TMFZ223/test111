import geb.Browser

Browser.drive {
    // Открытие страницы mosmetro.ru
    go "https://mosmetro.ru/metro-map"
Thread.sleep(12000)
    // Поиск и вывод текста на текстовых блоках
    (0..869).each { index ->
        def divElements = $("div", class: "fromto__select-list-item", index)
        if (divElements) {
            println "Текстовый блок ${index + 1}: ${divElements.text()}"
        } else {
            println "Текстовый блок ${index + 1} не найден"
        }
    }
}