import geb.Browser

Browser.drive {
    // Открытие страницы mosmetro.ru
    go "https://mosmetro.ru/passengers/information/stations/247"

    // нахождение второго заголовка
    def Heder = $("p", 1)

    // Проверка наличия заголовка и вывод его названия
    if (Heder) {
        println "Название заголовка: ${Heder.text()}"
    } else {
        println "Заголовок не найден"
    }
}