# rest-api-qr-check
Примеры использования API для получения электронных чеков с категоризацией товаров по содержимому QR кода

## Пример вывода:
```
API URL: https://rest-fns-check.herokuapp.com/check/t=20171007T0856&s=279.90&fn=8710000100923403&i=95961&fp=3153580303&n=1
Check: 2017-10-07 08:56, 279.90 (5)
Item: Молоко Kуб буренка 3.5% - 4.5% пастеризов 1400мл п/бут	Молочка	95.0	1.0
Item: Снежок Kуб Буренка 475г 2.5%	Молочка	48.0	1.0
Item: Яйцо куриное С0 отборка нефасованное 10шт Таганрогская ПФ	Мясо и птица	46.0	1.0
Item: Сахар песок Ассорти-Продукт ГОСТ 800г	Бакалея	28.0	1.0
Item: Kефир Kуб Буренка 2,5% 1л тп твист	Молочка	59.0	1.0
Raw response: {"document":{"receipt":{"kktRegId":"0000737726049005","user":"ООО \"Ассорти\"","userInn":"6162059175","requestNumber":214,"fiscalDriveNumber":"8710000100923403","stornoItems":[],"fiscalDocumentNumber":95961,"fiscalSign":3153580303,"nds0":27990,"items":[{"name":"Молоко Kуб буренка 3.5% - 4.5% пастеризов 1400мл п/бут","quantity":1,"sum":9590,"price":9590,"nds0":9590,"modifiers":[]},{"name":"Снежок Kуб Буренка 475г 2.5%","quantity":1,"sum":4870,"price":4870,"nds0":4870,"modifiers":[]},{"name":"Яйцо куриное С0 отборка нефасованное 10шт Таганрогская ПФ","quantity":1,"sum":4690,"price":4690,"nds0":4690,"modifiers":[]},{"name":"Сахар песок Ассорти-Продукт ГОСТ 800г","quantity":1,"sum":2850,"price":2850,"nds0":2850,"modifiers":[]},{"name":"Kефир Kуб Буренка 2,5% 1л тп твист","quantity":1,"sum":5990,"price":5990,"nds0":5990,"modifiers":[]}],"ecashTotalSum":27990,"totalSum":27990,"shiftNumber":122,"dateTime":"2017-10-07T05:56:00","cashTotalSum":0,"operationType":1,"receiptCode":3,"taxationType":1,"modifiers":[],"rawData":"//8AHKUDARAJhxAAAQCSNAMBdtnTUGMZZQF2AwACAiQDACACEQQQADg3MTAwMDAxMDA5MjM0MDMNBBQAMDAwMDczNzcyNjA0OTAwNSAgICD6AwwANjE2MjA1OTE3NSAgEAQEANl2AQD0AwQAoJbYWTUEBgAxBLv30Q8OBAQAegAAABIEBADWAAAAHgQBAAH8AwIAVm0jBFMABgQ2AIyuq66qriBL46EgoePgpa2qoCAzLjUlIC0gNC41JSCvoOHipeCop66iIDE0MDCsqyCvL6Hj4jcEAgB2Jf8DAwAD6AMTBAIAdiVQBAIAdiUjBDkABgQcAJGtpaauqiBL46EggePgpa2qoCA0NzWjIDIuNSU3BAIABhP/AwMAA+gDEwQCAAYTUAQCAAYTIwRWAAYEOQCfqeauIKrj4KitrqUgkTAgruKhruCqoCCtpeSg4a6ioK2trqUgMTDo4iCSoKOgreCuo+GqoO8gj5Q3BAIAUhL/AwMAA+gDEwQCAFISUAQCAFISIwRCAAYEJQCRoOWg4CCvpeGuqiCA4eGu4OKoLY/grqTjquIgg46RkiA4MDCjNwQCACIL/wMDAAPoAxMEAgAiC1AEAgAiCyMEPwAGBCIAS6XkqOAgS+OhIIHj4KWtqqAgMiw1JSAxqyDiryDioqjh4jcEAgBmF/8DAwAD6AMTBAIAZhdQBAIAZhcHBAEAADkEAgBWbf0DDQCCpeCl4arjrSCeq6jvHwQBAAEYBA0Ajo6OICKA4eGu4OKoIlAEAgBWbYEGC5bwekcw","operator":"Верескун Юлия"}}}
```
[Примеры работы модели](model-example)

## Java:
```
javac -cp org.json.jar QRQueryExample.java
java -cp '.:org.json.jar' QRQueryExample 
```

## Python:
```
python qr_query_example.py
```
