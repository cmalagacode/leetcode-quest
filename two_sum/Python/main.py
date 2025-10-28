def twoSum(nums: list[int], target: int) -> list[int]:
    found = False
    result = []

    for i in range(len(nums)):
        a = nums[i]
        for j in range(i + 1, len(nums)):
            b = nums[j]
            if a + b == target:
                result.append(i)
                result.append(j)
                found = True
                break
        if found:
            break
    return result



nums = [2,7,11,15]
target = 9
print(twoSum(nums, target))