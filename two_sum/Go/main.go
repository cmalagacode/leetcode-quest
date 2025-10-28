package main

import "fmt"


func twoSum(nums []int, target int) []int {
    found := false
	result := []int{}

	for i := 0; i < len(nums); i++ {
		var a int = nums[i]
		for j := i + 1; j < len(nums); j++ {
			var b int = nums[j]
			if a + b == target {
				result = append(result, i, j)
				found = true
				break
			}
		}
		if found {
			break
		}
	}
	return result
}

func main() {
	nums := []int{2,7,11,15}
	target := 9
	result := twoSum(nums, target)
	fmt.Println(result)
}