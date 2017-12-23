import json
import urllib2

qr_codes = ["t=20171007T0856&s=279.90&fn=8710000100923403&i=95961&fp=3153580303&n=1"]
for parameters in qr_codes:
    api_url = "https://rest-fns-check.herokuapp.com/check/" + parameters
    print("API URL: " + api_url)

    response = urllib2.urlopen(api_url)
    result = json.load(response)
    
    items = result["items"]
    time = result["check_time"]
    check_description = result["check_description"]
        
    print("Check: " + check_description)
    for item in items:
        name, price, count, category = item
        price = float(price)
        count = int(count)

        print("Item: %s\t%s\t%.2f\t%d" % (name, category, price, count))
    raw_response = result["raw_response"]
    print("Raw response: " + raw_response)
