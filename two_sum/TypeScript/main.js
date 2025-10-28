function twoSum(nums, target) {
    var found = false;
    var result = [];
    for (var i = 0; i < nums.length; i++) {
        var a = nums[i];
        for (var j = i + 1; j < nums.length; j++) {
            var b = nums[j];
            if (a + b === target) {
                result.push(i);
                result.push(j);
                found = true;
                break;
            }
        }
        if (found) {
            break;
        }
    }
    return result;
}
console.log(twoSum([2, 7, 11, 15], 9));
