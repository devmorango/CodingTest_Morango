function solution(a, b, flag) {
    var answer = 0;
    if(flag===true){
        answer=a+b;
    }
    else{
        answer=a-b;}
    return answer;
}

console.log(solution(-4,7,true));