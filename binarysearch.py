# Author  cytian
# Created 2016-07-20

def find(sortList, key):
    """
    return: finded index in sortList
    """
    low = 0
    up = len(sortList) - 1

    while True:
        tmp = (low + up)//2
        if key == sortList[tmp]:
            return tmp
        elif low > up: # not find
            return None
        elif key > sortList[tmp]:
            low = tmp + 1
        else:
            up = tmp - 1


def recFind(sortList, key, low, up):
    tmp = (low + up)//2
    if key == sortList[tmp]:
        return tmp
    elif low > up:
        return None
    elif key > sortList[tmp]:
        return recFind(sortList, key, low+1, up)
    else:
        return recFind(sortList,) (key, low, up-1)


sortList = [1, 2, 4, 5, 6, 9]
r = find(sortList, 5)
print(r)
r = recFind(sortList, 5, 0, len(sortList)-1)
print(r)
