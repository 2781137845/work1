package jdbc.dao;

import jdbc.entity.Web;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository(value = "daoImpl")
public class DaoImpl implements Dao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void addWeb(Web web) {
        String sql="insert into web values(?,?)";
        int add = jdbcTemplate.update(sql, web.getName(), web.getId());
        System.out.println(add);
    }

    @Override
    public void updateWeb(Web web) {
        String sql="update web set name = ? where id=?";
        int add = jdbcTemplate.update(sql, web.getName(), web.getId());
        System.out.println(add);
    }

    @Override
    public void deleteWeb(int id) {
        String sql="delete from web where id=?";
        int add = jdbcTemplate.update(sql,id);
        System.out.println(add);
    }

    @Override
    public int WatchOneWeb() {
        String sql="select count(*) from web";
        Integer i = jdbcTemplate.queryForObject(sql,Integer.class);
        return i;
    }

    @Override
    public Web selectOneWeb(int id) {
        String sql="select * from web where id=?";
        Web web = jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper<Web>(Web.class),id);
        return web;
    }

    @Override
    public List<Web> selectAllWeb() {
        String sql="select * from web";
        List<Web> query = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Web>(Web.class));
        return query;
    }

    @Override
    public void addSomeWeb(List<Object[]> list) {
        String sql="insert into web values(?,?)";
        jdbcTemplate.batchUpdate(sql, list);
    }

    @Override
    public void updateSomeWeb(List<Object[]> list) {
        String sql="update web set name=? where id=?";
        jdbcTemplate.batchUpdate(sql, list);
    }

    @Override
    public void deleteSomeWeb(List<Object[]> list) {
        String sql="delete from web where id=?";
        jdbcTemplate.batchUpdate(sql, list);
    }
}
