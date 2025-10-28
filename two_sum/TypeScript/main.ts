function twoSum(nums: number[], target: number): number[] {
    let found = false;
    let result: number[] = [];

    for (let i = 0; i < nums.length; i++) {
        let a = nums[i];
        for (let j = i + 1; j < nums.length; j++) {
            let b = nums[j];
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

console.log(twoSum([2,7,11,15], 9));