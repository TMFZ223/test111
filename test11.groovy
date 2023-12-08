import geb.Browser

Browser.drive {
    // Открытие страницы mosmetro.ru
    go "https://mosmetro.ru/metro-map"

    // нахождение четвёртого заголовка
    def Heder = $("p", 0)

    // Проверка наличия заголовка и вывод его названия
    if (Heder) {
        println "Название заголовка: ${Heder.text()}"
    } else {
        println "Заголовок не найден"
    }
}