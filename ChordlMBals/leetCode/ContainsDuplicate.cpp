#include <algorithm>
#include <unordered_set>
#include <vector>
using namespace std;

class Solution
{
public:
    bool containsDuplicate_sort(vector<int> &nums)
    {
        std::sort(nums.begin(), nums.end());
        for (int i = 0; i < nums.size() - 1; i++)
        {
            if (nums[i] == nums[i + 1])
                return true;
        }
        return false;
    }

    bool containsDuplicate_set(vector<int> &nums)
    {
        std::unordered_set<int> hash;
        for (int key : nums)
        {
            if (hash.find(key) != hash.end())
            {
                return true;
            }
            hash.insert(key);
        }
        return false;
    }
};