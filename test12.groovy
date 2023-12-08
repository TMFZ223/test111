import geb.Browser

Browser.drive {
    // Открытие страницы mosmetro.ru
    go "https://mosmetro.ru"

    // нахождение пятого заголовка
    def Heder = $("h2", 4)

    // Проверка наличия заголовка и вывод его названия
    if (Heder) {
        println "Название заголовка: ${Heder.text()}"
    } else {
        println "Заголовок не найден"
    }
}