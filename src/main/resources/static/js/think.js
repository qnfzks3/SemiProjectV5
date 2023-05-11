/*

공통사항 -
web.xml             ->
root-context        ->
servlet-context     ->
mariadb.properties  ->
log4j2.xml          -> 날짜 표현 등 로그 메세지

우리가 만든 순서

백엔드 - 서버에 테이블 생성 후에
1. mybatis      -> mybait.***mapper 내용을 쓴다.
2. Model        -> 모델을 지정해서 vo를 만들어준다. 테이블 컬럼명을 지정
3. DAO          -> DAO, DAOImpl  서버와 연결 해주기 때문 ,@Repository("bddao")
4. Service      -> Service,ServiceImpl DAO를 가져와서 홈페이지  ,@Service("bdsrv")
5. Controller   ->

프론트
1. tiles.xml      -> 고정부분 우선 - 헤더,푸터
2. template.jsp   -> 고정된 페이지 요소 지정

*/

