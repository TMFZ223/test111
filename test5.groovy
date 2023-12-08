import geb.Browser

Browser.drive {
    go "https://mosmetro.ru"

    def hedersCount = $("h2").size()

    println "Количество заголовков на странице: $hedersCount"
}