import geb.Browser

Browser.drive {
    go "https://mosmetro.ru"

    waitFor { title == "Московский метрополитен" }
    // Количество ссылок с названием
    def linksWithName = $("a").findAll { it.@href && it.text().trim().length() > 0 }

    // Количество ссылок без названия
    def linksWithoutName = $("a").findAll { it.@href && it.text().trim().length() == 0 }

    // Вывод результата
    println "Количество ссылок с названием: ${linksWithName.size()}, количество ссылок без названия: ${linksWithoutName.size()}"
}