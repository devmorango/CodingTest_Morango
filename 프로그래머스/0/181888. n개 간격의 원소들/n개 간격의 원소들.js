function solution(num_list, n) {
    var answer = [];
    for(let i=0;i<num_list.length;i++){
        // answer+=num_list[0];
        if(i%n==0)
            answer.push(num_list[i]); //+=안되고 .push!!
    }
    return answer;
}

console.log(solution([4,3,6,1,7],2));