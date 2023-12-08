import geb.Browser

Browser.drive {
    // открываем в браузере страницу сайта по ее адресу
    go "https://mosmetro.ru/metro-map"
    // приостанавливаем выполнение скрипта на 4 секунды, чтобы посмотреть содержимое страницы
    Thread.sleep(4000)
    // пишем в консоль количество текстовых блоков на странице
    println "Количество текстовых блоков на странице после её открытия: " + $("div.fromto__select-list-item").size()
    
    // выводим текст всех текстовых блоков
    $("div.fromto__select-list-item").each { element ->
        println element.text()
    }
}