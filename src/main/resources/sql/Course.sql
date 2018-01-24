-- 创建学院表
DROP TABLE if EXISTS `COLLEGE`;
CREATE TABLE `COLLEGE` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '学院ID',
  `COLLEGENUMBER` bigint(20) DEFAULT NULL COMMENT '学员编号',
  `COLLEGENAME` varchar(100) DEFAULT NULL COMMENT '学院名称',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT='学院表';


-- 创建课程表
DROP TABLE if EXISTS `CURRICULUM`;
CREATE TABLE `CURRICULUM` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '课程ID',
  `CURRICULUMNAME` varchar(100) DEFAULT NULL COMMENT '课程名称',
  `TEACHERID` bigint(20) DEFAULT NULL COMMENT '教师ID',
  `STUDENTID` bigint(20) DEFAULT NULL COMMENT '学生ID',
  `CLASSTIME` varchar(100) DEFAULT NULL COMMENT '上课时间',
  `CLASSPLACE` varchar(100) DEFAULT NULL COMMENT '上课地点',
  `CLASSWEEKLY` varchar(100) DEFAULT NULL COMMENT '课程时间周期',
  `CURRICULUMTYPE` smallint(6) DEFAULT NULL COMMENT '课程类型0选修课1必修课',
  `CREDIT` varchar(100) DEFAULT NULL COMMENT '学分',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=566 DEFAULT CHARSET=utf8 COMMENT='课程表';

-- 创建管理员表
DROP TABLE if EXISTS `MANAGER`;
CREATE TABLE `MANAGER` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '管理员ID',
  `MANAGERNAME` varchar(100) DEFAULT NULL COMMENT '管理员登录账号',
  `PASSWD` varchar(100) DEFAULT NULL COMMENT '学院名称',
  `ROLEID` bigint(20) DEFAULT NULL COMMENT '角色id',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=2333 DEFAULT CHARSET=utf8 COMMENT='管理员表';

-- 创建角色表
DROP TABLE if EXISTS `ROLE`;
CREATE TABLE `ROLE` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '角色ID',
  `ROLENAME` varchar(100) DEFAULT NULL COMMENT '角色名',
  `PERMISSIONS` varchar(100) DEFAULT NULL COMMENT '角色权限',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=1333 DEFAULT CHARSET=utf8 COMMENT='角色表';

-- 创建学生表
DROP TABLE if EXISTS `STUDENT`;
CREATE TABLE `STUDENT` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '学生ID',
  `STUDENTID` bigint(20) DEFAULT NULL COMMENT '学号',
  `STUNAME` varchar(100) DEFAULT NULL COMMENT '学生名字',
  `GENDER` smallint(6) DEFAULT NULL COMMENT ' 性别:0女，1男',
  `BIRTHDAY` bigint(20) DEFAULT NULL COMMENT '生日时间戳',
  `ENTRANCETIME` bigint(20) DEFAULT NULL COMMENT '入学时间戳',
  `COLLEGEID` bigint(20) DEFAULT NULL COMMENT '学院id',
  `PASSWD` varchar(100) DEFAULT NULL COMMENT '学生登录密码',
  `ROLEID` bigint(20) DEFAULT NULL COMMENT '角色id',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=3333 DEFAULT CHARSET=utf8 COMMENT='学生表';

-- 创建教师表
DROP TABLE if EXISTS `TEACHER`;
CREATE TABLE `TEACHER` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '教师ID',
  `TEACHERNAME` varchar(100) DEFAULT NULL COMMENT '教师名字',
  `GENDER` smallint(6) DEFAULT NULL COMMENT '性别:0女，1男',
  `COLLEGEID` bigint(20) DEFAULT NULL COMMENT '学院id',
  `PASSWD` varchar(100) DEFAULT NULL COMMENT '登录密码',
  `ROLEID` bigint(20) DEFAULT NULL COMMENT '角色id',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=4333 DEFAULT CHARSET=utf8 COMMENT='教师表';