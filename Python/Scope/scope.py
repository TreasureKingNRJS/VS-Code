def check_scope():
    def local():
        test = "local"
    def non_local():
        nonlocal test
        test = "non local"
    def _global():
        global test
        test = "Global"
    test = "Default"
    local()
    print("Test value after local: " + test)
    #This test is in check_scope
    non_local()
    print("Test value after non local: " + test)
    _global()
    print("Test value after global: " + test)
check_scope()
print("Test value after main: " + test)