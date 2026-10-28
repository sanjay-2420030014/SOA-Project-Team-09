package com.libraryfine.library;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping
public class LibraryController {
 private final MemberRepository members; private final BookRepository books;
 public LibraryController(MemberRepository m,BookRepository b){members=m;books=b;}

 @GetMapping("/members") public List<Member> members(){return members.findAll();}
 @PostMapping("/members") public Member addMember(@RequestBody Member m){return members.save(m);}
 @GetMapping("/members/{id}") public Member member(@PathVariable("id") Long id){return members.findById(id).orElseThrow();}
 @DeleteMapping("/members/{id}") public void deleteMember(@PathVariable("id") Long id){members.deleteById(id);}

 @GetMapping("/books") public List<Book> books(){return books.findAll();}
 @PostMapping("/books") public Book addBook(@RequestBody Book b){return books.save(b);}
 @GetMapping("/books/{id}") public Book book(@PathVariable("id") Long id){return books.findById(id).orElseThrow();}
 @DeleteMapping("/books/{id}") public void deleteBook(@PathVariable("id") Long id){books.deleteById(id);}
}
