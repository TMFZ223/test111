import geb.Browser

Browser.drive {
    // Открытие страницы mosmetro.ru
    go "https://mosmetro.ru"

    // нахождение ссылки
    def Link = $("a", 2)

    // Проверка наличия ссылки и вывод ее названия
    if (Link) {
        println "Название ссылки: ${Link.text()}"
    } else {
        println "Ссылка не найдена"
    }
}