# wc--l_for_MailruGroup
Тестовое задание для интенсива Golang MailGroup

Программа подсчитывает количество строк в файле и выводит на экран.

Можно запустить программу из среды разработки с указанием входного параметра.
Или собрать JARник и запустить его из cmd.

Для правильной работы JAR необходимо запустить его из командной строки с параметрами:
1) Если JARник находится в той же директории что и обрабатываемый файл, то можно просто указать полное имя файла:
   Пример:  java -jar wc--l_for_MailruGroup.jar 123.txt
2) Если JARник находится в другой директории нежели обрабатываемый файл, то необходимо указать полный путь до файла:
   Пример:  java -jar wc--l_for_MailruGroup.jar C:\Directory\Path\123.txt

Например в файле "123.txt" 14 строк
Результат работы: 14 123.txt       
